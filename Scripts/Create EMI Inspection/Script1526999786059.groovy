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

WebUI.click(findTestObject('FSM1/JH Test/Page_JM Control Centre/div_Create'))

WebUI.setText(findTestObject('FSM1/JH Test/Page_JM Control Centre/input_gwt-uid-8'), 'emi')

WebUI.click(findTestObject('FSM1/JH Test/Page_JM Control Centre/span_EMI Inspection'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/span_'))

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Address Search/Page_JM Control Centre/Postcode Search'))

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre/input_v-textfield v-widget v-t'), 
    Postcode)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (1)/SearchButton'))

FullAddress = WebUI.modifyObjectProperty(findTestObject('FSM1/Control Centre/Create EMI Inspection/Page_JM Control Centre/Address'), 
    'text', 'equals', findTestData('Data Files/EMI Inspection Data').getValue(2, 1), true)

WebUI.click(FullAddress)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Create Address/Page_JM Control Centre (2)/div_Add Selected Item'))

WebUI.click(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (1)/div_Scheduling WindowFollow SL'))

WebUI.setText(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (2)/input_gwt-uid-147'), Inspector)

InspectorName = WebUI.modifyObjectProperty(findTestObject('FSM1/JH Test 1/Page_JM Control Centre (4)/InspectorName'), 'text', 
    'equals', findTestData('Data Files/EMI Inspection Data').getValue(3, 1), true)

WebUI.click(InspectorName)

WebUI.click(findTestObject('FSM1/JH Test 2/Page_JM Control Centre/div_Duration'))

WebUI.setText(findTestObject('FSM1/JH Test 2/Page_JM Control Centre/input_gwt-uid-97'), '15')

WebUI.setText(findTestObject('FSM1/Control Centre/Create EMI Inspection/SLA/Page_JM Control Centre (1)/input_gwt-uid-103'), 
    '24 Hours')

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/SLA/Page_JM Control Centre (1)/span_24 Hours'))

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-107'), 'west')

WebUI.click(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/span_West'))

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-115'), InspectionType)

InspectionType = WebUI.modifyObjectProperty(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/InspectionType'), 'text', 
    'equals', findTestData('Data Files/EMI Inspection Data').getValue(4, 1), true)

WebUI.click(InspectionType)

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-117'), 'Mr Automation')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-123'), '111')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-125'), '222')

WebUI.setText(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/input_gwt-uid-133'), VisitType)

VisitType = WebUI.modifyObjectProperty(findTestObject('FSM1/JH Test 3/Page_JM Control Centre/VisitType'), 'text', 'equals', 
    findTestData('Data Files/EMI Inspection Data').getValue(5, 1), true)

WebUI.click(VisitType)

WebUI.click(findTestObject('FSM1/Control Centre/Create EMI Inspection/Finish/Page_JM Control Centre (3)/div_Create'))

WebUI.waitForElementPresent(findTestObject('FSM1/Control Centre/Status/Page_JM Control Centre/div_PLANNED DYNAMIC'), 120, 
    FailureHandling.STOP_ON_FAILURE)

InspectionID = WebUI.getText(findTestObject('FSM1/Control Centre/Create EMI Inspection/InspectionID/Page_JM Control Centre/InspectionID'))

InspectionID = InspectionID.replaceAll('Viewing Job ', '')

log.logWarning(InspectionID)

GlobalVariable.temp = InspectionID

