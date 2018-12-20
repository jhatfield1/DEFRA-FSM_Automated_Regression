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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/div_ABPR15 - Sample Submission'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/select_InvestigationRoutineVal'), 
    'Investigation', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/select_123Catering waste'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/input_Sample identity (e.g. se'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/input_Type of material sampled'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/select_Compost or digestatePro'), 
    'Compost or digestate', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/input_Test Requested (refer to'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/input_Clostridium perfringens'))

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/DateofSample'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/DateofSubmission'), formattedDate)

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete ABP Inspection/ABPR15 Sample Submission/Page_JClient/div_Save1'))

