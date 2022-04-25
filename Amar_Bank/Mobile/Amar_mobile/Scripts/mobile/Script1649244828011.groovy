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



Mobile.startApplication('D:\\Amar_Bank\\traveloka-3-42-0.apk', true)

Mobile.tap(findTestObject('mobile/mobile2/android.widget.EditText0 - Indonesia'), 0)

Mobile.tap(findTestObject('mobile/mobile2/android.widget.TextView0 - Indonesia'), 0)

Mobile.tap(findTestObject('mobile/mobile2/android.widget.Button0 - Lanjutkan'), 0)

Mobile.tap(findTestObject('mobile/mobile2/android.view.View0'), 0)

Mobile.tap(findTestObject('mobile/mobile2/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.TextView0 - Selanjutnya'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.TextView0 - OK Mengerti'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.TextView0 - Tiket Pesawat'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.EditText0 - Jakarta (JKTA)'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.TextView0 - Jakarta Indonesia'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.EditText0 - Surabaya (SUB)'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.TextView0 - Bali  Denpasar Indonesia'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.EditText0 - 1 penumpang'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.view.View0'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.view.View0 (1)'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.Button0 - Pilih'), 0)

Mobile.tap(findTestObject('mobile/mobile3/android.widget.Button0 - Cari'), 0)

Mobile.closeApplication()

