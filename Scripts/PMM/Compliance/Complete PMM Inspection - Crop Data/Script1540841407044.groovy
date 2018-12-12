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

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/div_Crop Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_House number or name_gwt'), 
    '12')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/select_Cotswold GoldHubbard Fl'), 
    'Cotswold Gold', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(c) Sex of birds_radio_g'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(d) Number of birds plac'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(f) Age of birds at plac'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(g) Number of Birds at i'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(h) Age of birds at insp'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/input_(n) House Floor area ava'), 
    '12')

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Complete PMM Inspection/Crop Data/Page_JClient/input_(e) Date birds placed_GK'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Complete PMM Inspection/Crop Data/Page_JClient/input_(p) Earliest slaughter d'), formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Crop Data/Page_JClient/Page_JClient/div_Save'))

