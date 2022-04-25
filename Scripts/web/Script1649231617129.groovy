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

WebUI.openBrowser('http://demo.guru99.com/test/newtours/register.php')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('null'), 'Budi')

WebUI.setText(findTestObject('null'), 'Anduk')

WebUI.setText(findTestObject('null'), '0872345667')

WebUI.setText(findTestObject('null'), 'user.mail@mail.com')

WebUI.setText(findTestObject('null'), 'jalan mawar')

WebUI.setText(findTestObject('null'), 'Bogor')

WebUI.setText(findTestObject('null'), 'Jawa Barat')

WebUI.setText(findTestObject('null'), '83233')

WebUI.selectOptionByLabel(findTestObject('null'), 'INDONESIA', false)

WebUI.setText(findTestObject('null'), 'testuser1')

WebUI.setText(findTestObject('null'), 'Test123!')

WebUI.setText(findTestObject('null'), 'Test123!')

WebUI.click(findTestObject('null'))