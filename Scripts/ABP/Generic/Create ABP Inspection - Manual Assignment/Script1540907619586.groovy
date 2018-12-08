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

KeywordLogger log = new KeywordLogger('')

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_Create'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_v-filterselect-button'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_gwt-uid-8'), 
    ABPInspection)

ABPInspectionTypeJ = WebUI.modifyObjectProperty(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/span_ABPR01A - Composting and'), 
    'text', 'equals', ABPInspectionType, true)

WebUI.click(ABPInspectionTypeJ, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_v-filterselect-button_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/span_24 Hours'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection/Page_JM Control Centre/div_Region_v-filterselect-butt'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/td_West'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection/Page_JM Control Centre/div_Plant Type_v-filterselect-'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/td_SECTION I Intermediate Acti'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection/Page_JM Control Centre/div_Inspection Type_v-filterse'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/td_Routine'))

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JClient/Page_JM Control Centre/Page_JM Control Centre/label_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection/Page_JM Control Centre/div_Inspector Grade Required_v'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/td_Tech'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection/Page_JM Control Centre/div_Sequence within Inspection'))

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/td_2 - Tech'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_Customer ID_gwt-uid-40'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_Unit ID_gwt-uid-42'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_Customer Name_gwt-uid-44'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/span_'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('FSM1/PreProd/Page_JM Control Centre/PostcodeSearch'), findTestData('Pre Production/ABP/ABP Inspection Data 01a').getValue(
        2, 1))

WebUI.doubleClick(findTestObject('JM_8918/Page_JM Control Centre/div_Search'))

FullAddress = WebUI.modifyObjectProperty(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/Address'), 
    'text', 'equals', findTestData('Pre Production/ABP/ABP Inspection Data 01a').getValue(3, 1), true)

WebUI.click(FullAddress, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_APPROVED'), 
    120, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/span_Schedule'))

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/label_Manually Allocate as an'))

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/div_Owner_v-filterselect-butto'))

WebUI.setText(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_Owner_gwt-uid-304'), 
    'test')

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/span_Test Inspector'))

WebUI.delay(3)

not_run: mydate = new Date()

not_run: tomorrow = mydate.next()

not_run: formattedDate = tomorrow.format('dd-MMM-yyyy')

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_Due date_gwt-uid-308'), 
    formattedDate)

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_From date_gwt-uid-306'), 
    formattedDate)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_Allocate'))

InspectionID = WebUI.getText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

WebUI.delay(90)

