
rm -rf  /Users/Eson/Documents/LogBy/

mkdir  /Users/Eson/Documents/LogBy/

/Users/Eson/Library/Android/sdk/platform-tools/adb shell rm -rf  data/local/tmp/ABCLauncherTestLog/

/Users/Eson/Library/Android/sdk/platform-tools/adb shell mkdir  data/local/tmp/ABCLauncherTestLog/

/Users/Eson/Library/Android/sdk/platform-tools/adb shell touch  data/local/tmp/ABCLauncherTestLog/LogRecord.txt

/Users/Eson/Library/Android/sdk/platform-tools/adb shell rm -rf /sdcard/Robotium-Screenshots/

/Users/Eson/Library/Android/sdk/platform-tools/adb push /Users/Eson/Documents/WorkSpaceForAndroidAuto/AutoTest_ABCLauncher/bin/ABCLauncherAutoTest.jar data/local/tmp

/Users/Eson/Library/Android/sdk/platform-tools/adb shell uiautomator runtest ABCLauncherAutoTest.jar  -c com.auto.test.abclauncher.testABCLauncher_Weather

/Users/Eson/Library/Android/sdk/platform-tools/adb pull data/local/tmp/ABCLauncherTestLog /Users/Eson/Documents/LogBy

/Users/Eson/Library/Android/sdk/platform-tools/adb pull /sdcard/Robotium-Screenshots /Users/Eson/Documents/LogBy