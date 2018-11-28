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

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/div_Samples Taken NFA'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/div_Minimum number of instance'), 
    'Minimum number of instances allowed is 2')

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/select_Compound or concentrate'), 
    'COMPOUND_OR_CONCENTRATE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/select_RuminantsNon-ruminantsP'), 
    'RUMINANTS', true)

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/input_Feed name_gwt-TextBox GK'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/select_YesNo'), 
    'YES', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/select_UKImport'), 
    'UK', true)

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/input_Batch no._gwt-TextBox GK'), 
    '123')

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/input_Laboratory_gwt-TextBox G'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/input_Operator_gwt-TextBox GKH'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/input_Office_gwt-TextBox GKH2E'), 
    'Test')

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/NFA Samples/Page_JClient/Page_JClient/Page_JClient/div_Save'))

WebUI.delay(3)

