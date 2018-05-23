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

not_run: WebUI.setText(findTestObject('FSM1/JH Test/Page_Job Manager Login/input_gwt-uid-3'), 'jon.hatfield')

not_run: WebUI.setText(findTestObject('FSM1/JH Test/Page_Job Manager Login/input_gwt-uid-5'), 'Fr@nc1sJ0n')

not_run: WebUI.sendKeys(findTestObject('FSM1/JH Test/Page_Job Manager Login/input_gwt-uid-5'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('FSM1/JH Test/Page_JM Control Centre/div_Create'))

WebUI.setText(findTestObject('FSM1/JH Test/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('FSM1/JH Test/Page_JM Control Centre/span_EMI Inspection'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/span_'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre/input_v-textfield v-widget v-t'), 
    'cv37 6sn')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (1)/SearchButton'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/div_90 Clopton Road Stratford'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.click(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (1)/div_Scheduling WindowFollow SL'))

WebUI.setText(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (2)/input_gwt-uid-147'), 'jon')

WebUI.click(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (4)/span_Jon Hatfield', [('variable') : '']))

WebUI.click(findTestObject('FSM1/JH Test 2/Page_JM Control Centre/div_Duration'))

WebUI.setText(findTestObject('FSM1/JH Test 2/Page_JM Control Centre/input_gwt-uid-97'), '15')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-107'), 'west')

WebUI.click(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/span_West'))

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-115'), 'emi routine')

WebUI.click(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/span_EMI Routine'))

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-117'), 'Mr Automation')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-123'), '111')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-125'), '222')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-133'), 'egg packer')

WebUI.click(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/span_EGG PACKER'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('FSM1/Control Centre/Status/Page_JM Control Centre/div_PLANNED DYNAMIC'), 60, 
    FailureHandling.STOP_ON_FAILURE)

InspectionID = WebUI.getText(findTestObject('FSM1/Control Centre/Create EMI Inspection/InspectionID/Page_JM Control Centre/div_Viewing Job 33605'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

