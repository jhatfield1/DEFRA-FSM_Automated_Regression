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

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/div_Processor Details'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/input_Processor Name_gwt-TextB'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/textarea_Processor Address_gwt'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/input_Processor Postcode_gwt-T'), 
    'Test aut')

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Processor Details/Page_JClient/Page_JClient/div_SaveCancel'))

