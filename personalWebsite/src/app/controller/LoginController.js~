angular.module('personalWebsite').controller('LoginController', LoginController)
    .directive('strongPassword', strongPassword);


function strongPassword(){
    return {
        require: 'ngModel',
        link: function(scope, elm, attrs, ctrl) {
            var basic=10, multipleSpecialCharacters= 0, multipleDigits= 0, multipleUpperCase=0;
            console.log("directive");
            ctrl.$validators.containsSpecial = function(modelValue, viewValue) {
                if (ctrl.$isEmpty(modelValue)) {multipleSpecialCharacters=0;internalMod(); return true; }
                if (/[^a-z0-9]/i.test(viewValue)) {
                    if(recurringPaterns(viewValue,/[^a-z0-9]/i).length>1){multipleSpecialCharacters=30;internalMod();}
                    else {multipleSpecialCharacters=0;internalMod();}
                    return true; }
                return false;
            };

            ctrl.$validators.containsDigit = function(modelValue, viewValue) {
                if (ctrl.$isEmpty(modelValue)) { multipleDigits=0;internalMod(); return true; }
                if (/\d/.test(viewValue)) {
                    if(recurringPaterns(viewValue,/\d/).length>1){multipleDigits=30;internalMod();}
                    else {multipleDigits=0;internalMod();}
                    return true; }
                return false;
            };

            ctrl.$validators.containsUppercase = function(modelValue, viewValue) {
                if (ctrl.$isEmpty(modelValue)) { multipleDigits=0;internalMod(); return true; }
                if (/[A-Z]/.test(viewValue)) {
                    if(recurringPaterns(viewValue,/[A-Z]/).length>1){multipleUpperCase=30;internalMod();}
                    else {multipleUpperCase=0;internalMod();}
                    return true; }
                return false;
            };
            function internalMod() {
                var completionLevel = basic + multipleSpecialCharacters + multipleDigits + multipleUpperCase;
                angular.element(document.querySelector('#progressBar')).css('width', (basic + multipleSpecialCharacters + multipleDigits + multipleUpperCase).toString()+'%' );
                if(completionLevel==10)
                    angular.element(document.querySelector('#progressBar')).removeClass( "progress-bar-warning progress-bar-info progress-bar-success" ).addClass( "progress-bar-danger" );
                else if(completionLevel==40)
                    angular.element(document.querySelector('#progressBar')).removeClass( "progress-bar-danger  progress-bar-info progress-bar-success" ).addClass( "progress-bar-warning" );
                else if(completionLevel==70)
                    angular.element(document.querySelector('#progressBar')).removeClass( "progress-bar-danger progress-bar-warning progress-bar-success" ).addClass( "progress-bar-info" );
                else if(completionLevel==100)
                    angular.element(document.querySelector('#progressBar')).removeClass( "progress-bar-danger progress-bar-warning progress-bar-info" ).addClass( "progress-bar-success" );

            }
        }
    };
}

function LoginController()
{
    var LoginVm = this;
    LoginVm.LoginMessage = "Please log In first";
    LoginVm.cardLogo="Default-logo.png";
    LoginVm.formSubmit=function()
    {
        console.log("submit");
    }
    LoginVm.cardCompanyEvaluator=function()
    {
        LoginVm.LoginMessage=LoginVm.value;
        if(LoginVm.value !== undefined)
        {
            if(LoginVm.value.length>4 && LoginVm.value.length<7 )
            {
                if(LoginVm.value.substring(0, 1) == 4)
                    LoginVm.cardLogo="visa_logo.gif";
                else if((LoginVm.value.substring(0, 2) >= 34) && (LoginVm.value.substring(0, 2) <= 37) )
                    LoginVm.cardLogo="american_express_logo.gif";
                else if((LoginVm.value.substring(0, 2) >= 51) && (LoginVm.value.substring(0, 2) <= 55) )
                    LoginVm.cardLogo="mastercard_logo.gif";
                else if((LoginVm.value.substring(0, 4) == 6011))
                    LoginVm.cardLogo="discover_logo.gif";

            }
            else if(LoginVm.value.length<4)
                LoginVm.cardLogo="Default-logo.png";
        }
        else
            LoginVm.cardLogo="Default-logo.png";
    }

    LoginVm.number1='';
    LoginVm.numberRes='';
    LoginVm.numberStr='';
    var operator='';
    LoginVm.testFunction=function(num)
    {

        if (/\d/.test(parseInt(num))) {
            LoginVm.numberRes=LoginVm.numberRes+num;
            LoginVm.numberStr=LoginVm.numberStr+num;
        }
        else{
            if(operator!='' && num!='=' )
            {
                resetSystem();
            }
            else if(num=='+')
            {operator='+';storeNumber1(num);}
            else if(num=='-')
            {operator='-';storeNumber1(num);}
            else if(num=='*')
            {operator='*';storeNumber1(num);}
            else if(num=='/')
            {operator='/';storeNumber1(num);}
            else if(num=='=')
            {
                switch (operator) {
                    case '+':
                        LoginVm.numberStr=parseInt(LoginVm.number1)+parseInt(LoginVm.numberRes);
                        LoginVm.numberRes=LoginVm.numberStr.toString();
                        operator='';
                        break;
                    case '-':
                        LoginVm.numberStr=parseInt(LoginVm.number1)-parseInt(LoginVm.numberRes);
                        LoginVm.numberRes=LoginVm.numberStr.toString();
                        operator='';
                        break;
                    case '*':
                        LoginVm.numberStr=parseInt(LoginVm.number1)*parseInt(LoginVm.numberRes);
                        LoginVm.numberRes=LoginVm.numberStr.toString();
                        operator='';
                        break;
                    case '/':
                        if(parseInt(LoginVm.numberRes)==0)
                        {
                            LoginVm.numberStr='Zero error';
                            break;
                        }
                        LoginVm.numberStr=parseInt(LoginVm.number1)/parseInt(LoginVm.numberRes);
                        LoginVm.numberRes=LoginVm.numberStr.toString();
                        operator='';
                        break;
                }
            }

        }

    }

    var resetSystem=function()
    {
        LoginVm.number1='';
        LoginVm.numberRes='';
        LoginVm.numberStr='';
    }
    var storeNumber1=function(num)
    {
        LoginVm.number1=LoginVm.numberRes;
        LoginVm.numberRes='';
        LoginVm.numberStr=LoginVm.numberStr+num;
    }
}



function recurringPaterns(string,pattern) {
    var str = string;
    var resultList=[];
    var n = str.search(pattern);
    var i=0;
    while(n>-1)
    {
        resultList.push(i+n);
        i=(i+n)+1;
        str = str.substring(n+1, str.length);
        n = str.search(pattern);
    }

   return resultList;
}
