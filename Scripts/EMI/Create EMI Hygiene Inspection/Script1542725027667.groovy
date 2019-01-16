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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

KeywordLogger logg = new KeywordLogger('')

WebUI.waitForElementClickable(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_Create'), 
    60, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_Create'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_EMI Hygiene Inspection'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-16'), '15')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_1'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_24 Hours'))

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JM Control Centre/div_Region_v-filterselect-butt'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_West'))

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JM Control Centre/div_Inspection Type_v-filterse'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_EMI Hygiene Inspection'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-34'), 'Test Automation')

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-40'), RandomStringUtils.randomNumeric(
        5))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/input_gwt-uid-42'), RandomStringUtils.randomNumeric(
        5))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/span_'))

not_run: WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('JM_8918/Page_JM Control Centre/input_Add Location_v-textfield'), findTestData('Pre Production/EMI/EMI Inspection Data').getValue(
        1, 1))

WebUI.doubleClick(findTestObject('JM_8918/Page_JM Control Centre/div_Search'))

FullAddress = WebUI.modifyObjectProperty(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/Address'), 
    'text', 'equals', findTestData('Pre Production/EMI/EMI Inspection Data').getValue(2, 1), true)

WebUI.click(FullAddress, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.delay(5)

WebUI.setText(findTestObject('JM_8918/EMI/Fixed Resource/Page_JM Control Centre/input_Fixed Resource_gwt-uid-1'), 'test')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_Test Inspector'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('FSM1/Control Centre/Status/Page_JM Control Centre/div_PLANNED DYNAMIC'), 120, 
    FailureHandling.STOP_ON_FAILURE)

InspectionID = WebUI.getText(findTestObject('FSM1/Control Centre/Create EMI Inspection/InspectionID/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

logg.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

WebUI.delay(30)

