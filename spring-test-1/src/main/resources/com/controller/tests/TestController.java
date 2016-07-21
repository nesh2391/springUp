package com.controller.tests;

@RunWith(MockitoJUnitRunner.class)
public class TestController {
	
	@InjectMocks
	private Controller controller = new Controller();
	
	@Moc
	private SimpleFun simpleFun;
	
	@Before
    public void setUp() {
        // We want to make sure that when we call getFileData(), it returns
        // something non-null, so we return the mock of fileData.
        when(simpleFunRules.sum()).thenReturn(8);
    }
	
	public void runSample(){
		int res = controller.pingBackValue();
		assertEquals(res,8);
	}

}
