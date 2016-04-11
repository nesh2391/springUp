var gulp = require('gulp');
var inject =require('gulp-inject');
var bowerfiles = require('main-bower-files');
var browserSync = require('browser-sync').create();

var config ={
    paths:{
    src:'./src',
    dist:'.',
    bower:'./bower_components'
}
};

gulp.task('test', function(){
    console.log('Hello this is a test');
});

gulp.task('inject',function(){
    var sources =  gulp.src(
        [config.paths.src+'/**/*.js',config.paths.src+'/**/*.css' ],
        {read:false}
    );

    return gulp.src(config.paths.src+'/index.html')
        .pipe(inject(gulp.src(bowerfiles(),{read:false}),{name:'bower',addPrefix:'personalWebsite'}))
        .pipe(inject(sources,{addPrefix:'personalWebsite'}))
        .pipe(gulp.dest(config.paths.dist))
});

gulp.task('serve',['inject'],function(){
    browserSync.init(
        {
            port:3010,
            server:{
                baseDir:[config.paths.dist]
            }
        }
    )
});