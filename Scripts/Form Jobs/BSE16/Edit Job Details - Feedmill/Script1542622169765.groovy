import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/div_Edit attributes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/select_Southern-1Southern-2Sou'), 
    'SOUTHERN1', true)

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Email_gwt-TextBox GKH2EK'), 'test@automation.com')

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Vet_radio_group_2'))

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_TownFarm_gwt-TextBox GKH'), 'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/textarea_Address_gwt-TextArea'), 'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Postcode_gwt-TextBox GKH'), 'CV37 6SN')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/select_FeedmillImporterInterme'), 
    findTestData('Pre Production/Form Jobs/BSE16/BSE16 - Feedmill').getValue(1, 1), false)

WebUI.delay(3)

