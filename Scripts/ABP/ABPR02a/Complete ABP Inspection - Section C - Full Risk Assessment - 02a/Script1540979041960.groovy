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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/div_Section C Risk Assessment'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_3 - Cat 3 material and'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_0 - Very low throughput'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_0 - No product entering'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_0 - Not required or com'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_0 - Fully compliant iss'), 
    '10', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/input_Is this a fully complian'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/select_AnnuallyQuarterly6 Mont'), 
    'Biennially', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/textarea_Any other relevant in'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR02a/Page_JClient/Page_JClient/div_Save'))

