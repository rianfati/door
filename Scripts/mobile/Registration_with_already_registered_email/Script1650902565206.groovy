import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\rianf\\Downloads\\Sample Android App Login Test_v4.0_apkpure.com.apk', true)

Mobile.tap(findTestObject('mobile/Door_registration/android.widget.TextView0 - No account yet Create one'), 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0'), 'admin', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (1)'), 'admin@mail.com', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (2)'), 'password123', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (3)'), 'password123', 0)

Mobile.tap(findTestObject('mobile/Door_registration/android.widget.Button0 - REGISTER'), 0)

Mobile.scrollToText('Already a member? Login')

Mobile.tap(findTestObject('mobile/Door_registration/android.widget.TextView0 - Already a member Login'), 0)

Mobile.tap(findTestObject('mobile/Door_registration/android.widget.TextView0 - No account yet Create one'), 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0'), 'admin', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (1)'), 'admin@mail.com', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (2)'), 'password123', 0)

Mobile.setText(findTestObject('mobile/Door_registration/android.widget.EditText0 (3)'), 'password123', 0)

Mobile.tap(findTestObject('mobile/Door_registration/android.widget.Button0 - REGISTER'), 0)

Mobile.verifyElementExist(findTestObject('mobile/Door_registration/email_already_exist_alert'), 0)
