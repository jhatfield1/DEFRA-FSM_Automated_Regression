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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger('')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/div_Create'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Type_gwt-uid-8'), 
    'cso01 - ncp salmonella')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/span_CSO01 - NCP Salmonella'))

not_run: WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Type_gwt-uid-8'), 
    'CSO01 - NCP Salmonella')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/div_SLA_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/td_24 Hours'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/div_Flock Type_v-filterselect-'))

FlockType = WebUI.modifyObjectProperty(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/span_Breeding Chickens'), 
    'text', 'equals', FlockType, true)

WebUI.click(FlockType, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/span_Breeding Chickens'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/div_Region_v-filterselect-butt'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/span_West'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Customer ID_gwt-uid-34'), 
    RandomStringUtils.randomNumeric(5))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Customer Name_gwt-uid-36'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Customer Phone_gwt-uid-3'), 
    '07824487657')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Customer email_gwt-uid-4'), 
    'test@automation.com')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Name_gwt-uid-42'), 
    'Test Automation Reg')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Phone_gwt-uid-44'), 
    '017877645322')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_CPHRegistration Number_g'), 
    '11/222/3333')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Create Inspection/Page_JM Control Centre/input_Survey Ref_gwt-uid-48'), 
    RandomStringUtils.randomNumeric(5))

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

not_run: WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_Owner_gwt-uid-311'), 
    'Test Inspector')

mydate = new Date()

tomorrow = mydate.next()

formattedDate = tomorrow.format('dd-MMM-yyyy')

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_From date_gwt-uid-504 (10)'), 
    formattedDate)

WebUI.setText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/input_Due date_gwt-uid-506 (11)'), 
    formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/div_Allocate'))

InspectionID = WebUI.getText(findTestObject('Object Repository/FSM1/Create ABP Inspection Manual Ass/Page_JM Control Centre/Page_JM Control Centre/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

WebUI.delay(90)

