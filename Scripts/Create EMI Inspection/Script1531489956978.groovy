import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://kirona-def-2.kirona.com/jmtest/login#!loginView')

not_run: WebUI.setText(findTestObject('FSM1/Control Centre/Page_Job Manager Login/input_gwt-uid-3'), 'Jon.Hatfield')

not_run: WebUI.setText(findTestObject('FSM1/Control Centre/Page_Job Manager Login/input_gwt-uid-5'), 'Fr@nc1sJ0n')

not_run: WebUI.click(findTestObject('FSM1/Control Centre/Page_Job Manager Login/Page_Job Manager Login/div_Login'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_Create'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_EMI Inspection'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-16'), '15')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_1'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_24 Hours'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_2'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_West'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_2'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_EMI Routine'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-34'), 'Test Automation')

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-40'), '111')

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-42'), '222')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_2'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/td_EGG PACKER'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/span_'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre/input_v-textfield v-widget v-t'), 
    findTestData('EMI Inspection Data').getValue(1, 1))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (1)/SearchButton'))

FullAddress = WebUI.modifyObjectProperty(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/Address'), 
    'text', 'equals', findTestData('Data Files/EMI Inspection Data').getValue(2, 1), true)

WebUI.click(FullAddress, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.delay(2)

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection/FixedResource/Page_JM Control Centre (3)/input_gwt-uid-145'), 
    'jon')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_Jon Hatfield'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('FSM1/Control Centre/Status/Page_JM Control Centre/div_PLANNED DYNAMIC'), 120, 
    FailureHandling.STOP_ON_FAILURE)

InspectionID = WebUI.getText(findTestObject('FSM1/Control Centre/Create EMI Inspection/InspectionID/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

