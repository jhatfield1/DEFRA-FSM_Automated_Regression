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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_County Parish Holding (C'), 
    '11/222/3333')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_No'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Customer Name_gw'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/textarea_Updated Customer Addr'), 
    'Hazelwood Manor Farm , Cherington Road Burmington, Shipston on Stour, CV36 5AR (UPRN:SP 26605 37867)')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Customer Postcod'), 
    'CV36 5AR')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Customer Phone_g'), 
    '07812664043')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Customer Email_g'), 
    'updated@gmail.com')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes_1'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Operator Name_gw'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/textarea_Updated Operator Addr'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Operator Postcod'), 
    'B93 0HN')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Operator Phone_g'), 
    '07812664043')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Updated Operator Email_g'), 
    'updated@gmail.com')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/label_LA Trading Standards'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/label_LA Environment Health'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/label_Other non-DEFRA'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes_3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Name of plant representa'), 
    'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/textarea_Issues raised at last'), 
    'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/select_SatisfactoryUnsatisfact_1'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/select_SatisfactoryUnsatisfact_2'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/select_SatisfactoryUnsatisfact_3'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/select_SatisfactoryUnsatisfact_4'), 
    'S', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/textarea_General Visit Comment'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_No_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_No_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_No_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/select_(a) Continue with curre'), 
    'Continue with current approval', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_No_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/span_Yes_5'))

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/Section A/Page_JClient/NotifiedAndActions'), 'Test Automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/input_Chargeable time (minutes'), 
    '10')

not_run: WebUI.delay(60)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/Section A/Page_JClient/div_Save'))

