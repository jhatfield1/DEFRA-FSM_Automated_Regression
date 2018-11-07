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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Page_JClient/div_Data Capture'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Page_JClient/div_Packer'))

WebUI.click(findTestObject('FSM1/PreProd/Page_JClient/CreateButton'))

WebUI.selectOptionByValue(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Page_JClient/InspectionCode1'), 'CAT', 
    true)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Page_JClient/input_gwt-DoubleBox GKH2EKQBOH'), '25')

WebUI.delay(2)

WebUI.check(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient (6)/span_Na'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient (6)/Page_JClient/Premises Compliant - Yes'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Premises - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Equipment Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Equipment - Low Risk - equipment not compliant'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Equipment - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Quality Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Quality - Low Risk - Poor Quality'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Quality - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Weight Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Weight - Low to Medium Risk'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Weight - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Marking Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Marking - Low to Medium Risk'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Marking - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Grading Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Grading - Low to Medium'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Grading - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Packing Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Packing - Low to Medium'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Packing - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Labelling Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Labelling - Low Risk'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Labelling - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Records Compliant - No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Records - Low Risk'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Records - Notes and Comments'), 
    'Test Automation')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient (3)/span_No'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture/Data Capture Packer/Page_JClient/Save'))

WebUI.delay(10)

