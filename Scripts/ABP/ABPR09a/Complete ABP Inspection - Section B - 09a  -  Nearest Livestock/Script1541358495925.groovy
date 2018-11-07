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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/div_Section B Nearest Livestoc'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/input_Species_gwt-TextBox GKH2'), 
    'test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/input_Quantity_gwt-DoubleBox G'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/input_Name_gwt-TextBox GKH2EKQ'), 
    'test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/textarea_Address_gwt-TextArea'), 
    'test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/input_Tel. No._gwt-TextBox GKH'), 
    '07812664043')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/input_County Parish Holding (C'), 
    '11/222/3333')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR09a - Section B - Details/Section B - Nearest Livestock/Page_JClient/div_Save'))

