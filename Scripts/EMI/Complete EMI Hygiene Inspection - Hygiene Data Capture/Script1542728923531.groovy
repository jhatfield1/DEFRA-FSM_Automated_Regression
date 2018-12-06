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

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/div_Hygiene Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Premises_radio_group_14'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Equipment_radio_group_15'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Records (Veterinary Medi'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Packaging_radio_group_17'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_SMT - Free Range_radio_g'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Operator NCP Compliant_r'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Feed_radio_group_20'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Staff Hygiene_radio_grou'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Welfare_radio_group_22'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Hygiene at Producer_radi'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Cage Enriched_radio_grou'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_SMT Barn_radio_group_25'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Follow Up inspection req'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/div_Follow Up Inspections'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/textarea_Contravention Detail_'), 
    'Test automation')

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/input_Rectification Date_GKH2E'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/input_Follow Up Date_GKH2EKQBO'), formattedDate)

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Premises ID_gwt-TextBox'), 
    '123')

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/div_Save_Follow_up'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/div_Flock Details'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_House Name  Number_gwt-T'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Number of Birds_gwt-Doub'), 
    '10')

WebUI.sendKeys(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/input_Date of Placing_GKH2EKQB'), formattedDate)

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/input_Age of Flock (Weeks)_gwt'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/EMI Hygiene1/Hygiene Data Capture/Page_JClient/select_Babcock B380Black Rocks'), 
    'CAPONS', true)

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/div_Save_Flock'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Hygiene Data/Page_JClient/div_Save_Data_Capture'))

