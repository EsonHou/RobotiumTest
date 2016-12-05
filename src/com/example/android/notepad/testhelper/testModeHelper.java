package com.example.android.notepad.testhelper;

import com.jayway.android.robotium.solo.Solo;

public class testModeHelper {
	private Solo solo;

	public void clickText(String str) {
		if (solo.searchText(str)) {
			solo.clickOnText(str);
		} else if (solo.searchText(str, 10, true)) {

			solo.clickOnText(str);
		}else{
			
		}
	}
}
