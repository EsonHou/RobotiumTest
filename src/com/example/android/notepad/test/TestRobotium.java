package com.example.android.notepad.test;



import com.example.android.notepad.NotesList;
import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.Smoke;

public class TestRobotium extends ActivityInstrumentationTestCase2<NotesList>{

	private Solo solo;
	
	public TestRobotium() {
		super(NotesList.class);
		//super("包名",NotesList.class);不赞成使用
		// TODO Auto-generated constructor stub
	}
	

	@Override
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(),getActivity());
		super.setUp();
	}


	@Override
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
		super.tearDown();
	}


	@Smoke
	public void test() {
        for (int i = 0; i < 10; i ++){  
            solo.clickOnButton("原始数据");  
        }  
        solo.clickOnButton("跳转");  
        solo.scrollDown();
        solo.clearEditText(2);
        solo.goBack();  
        solo.clickOnButton("原始数据");  
		fail("Not yet implemented");
		solo.assertCurrentActivity("", NotesList.class);
		solo.searchEditText("");
		
	}
	@Smoke
	public void testabc(){
        for (int i = 0; i < 19; i ++){  
            solo.clickOnButton("原始数据");  
        }  
        solo.clickOnButton("跳转");  
        solo.scrollDown();
        solo.clearEditText(2);
        solo.goBack();  
        solo.clickOnButton("原始数据");  
		fail("Not yet implemented");
		solo.assertCurrentActivity("", NotesList.class);
		solo.searchEditText("");
	}

}
