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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Adactin Hotel/Login Page Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Adactin Hotel/Search Hotel Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Adactin Hotel/Select Hotel Test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/input__first_name'), 'Revathi ')

WebUI.setText(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/input__last_name'), 'Nair')

WebUI.setText(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/textarea__address'), 'Westmead')

WebUI.setText(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/input_Use 16 digit Dummy Data_cc_num'), 
    '1234567890123456')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/select_- Select Credit Card Type -         _b35779'), 
    'AMEX', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/select_- Select Month -            January _3505f5'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/select_- Select Year -                     _fa2652'), 
    '2028', true)

WebUI.setText(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/input__cc_cvv'), '123')

WebUI.click(findTestObject('Object Repository/Page_Adactin.com - Book A Hotel/input__book_now'))

