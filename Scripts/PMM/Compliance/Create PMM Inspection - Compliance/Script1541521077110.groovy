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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

KeywordLogger log = new KeywordLogger('')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/div_Create'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Type_gwt-uid-8'), 
    'pmr03a')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_PMR03A - Producer Complia'))

not_run: WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Type_gwt-uid-8'), 
    'PMR03A - Producer Compliance / Follow Up Inspection')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/div_v-filterselect-button_1'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection New/Page_JM Control Centre/span_24 Hours'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Region_gwt-uid-24'), 
    'w')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_West'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Region_gwt-uid-24'), 
    'West')

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Priority_gwt-uid-26'), 
    'h')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_High'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Priority_gwt-uid-26'), 
    'High')

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Inspection Type_gwt-uid-'), 
    'r')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_Routine'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/div_Production Type_v-filterse'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_Extensive Indoor (Barn Re'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/div_Species_v-filterselect-but'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/span_Chicken'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Keeper ID_gwt-uid-36'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Keeper Name_gwt-uid-38'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Keeper Contact Name_gwt-'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Location ID_gwt-uid-46'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Customer ID_gwt-uid-50'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Customer Name_gwt-uid-52'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_Customer Contact Name_gw'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_County Parish Holding (C'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/a/Page_JM Control Centre/Page_JM Control Centre/input_CPHH_gwt-uid-66'), 
    RandomStringUtils.randomNumeric(5))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/span_'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('FSM1/PreProd/Page_JM Control Centre/PostcodeSearch'), findTestData('Pre Production/PMM/PMM Inspection Data').getValue(
        1, 1))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (1)/SearchButton'))

FullAddress = WebUI.modifyObjectProperty(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/Address'), 
    'text', 'equals', findTestData('Pre Production/PMM/PMM Inspection Data').getValue(2, 1), true)

WebUI.click(FullAddress, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/b/Page_JM Control Centre/input_Fixed Resource_gwt-uid-1'), 
    'test')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/b/Page_JM Control Centre/span_Test Inspector'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/b/Page_JM Control Centre/div_Auto Schedulable_v-filters'))

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/b/Page_JM Control Centre/input_Fixed Resource_gwt-uid-1'), 
    'Test Inspector')

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/b/Page_JM Control Centre/span_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('FSM1/Control Centre/Status/Page_JM Control Centre/div_PLANNED DYNAMIC'), 120, 
    FailureHandling.STOP_ON_FAILURE)

InspectionID = WebUI.getText(findTestObject('FSM1/Control Centre/Create EMI Inspection/InspectionID/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

WebUI.delay(160)

