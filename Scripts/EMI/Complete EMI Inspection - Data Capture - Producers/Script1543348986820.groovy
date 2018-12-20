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

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Producer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Inspection Duration 1 (m'), 
    '')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/select_ADLAORAPCAPLASDCATCCICS'), 
    'ADL', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Inspection Duration 1 (m'), 
    '12')

WebUI.delay(3)

not_run: WebUI.check(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/input_Premises_radio_group_17'))

WebUI.click(findTestObject('JM_8918/New/Page_JClient/label_Yes_Premises'))

WebUI.click(findTestObject('JM_8918/New/Page_JClient/input_Premises_radio_group_1_NEW'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Marking (Eggs)_radio_gro'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Packaging_radio_group_3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Labelling_radio_group_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_SMT Free Range_radio_gro'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Barn_radio_group_6'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Cage Enriched_radio_grou'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Records_radio_group_8'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Hygiene at Producer_radi'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Welfare_radio_group_10'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Yes_radio_group_11'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Operator NCP Contraventi'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/textarea_Remarks_gwt-TextArea'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Records (Eggs  Hens)_rad'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Records (Veterinary Medi'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Penalty Notice Issued fo'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Follow Up inspection req'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Flock Details'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ - Flock'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_House Name  Number_gwt-T'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Number of Birds_gwt-Doub'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Age of Flock (Weeks)_gwt'), 
    '12')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/select_Babcock B380Black Rocks'), 
    'BLACK_ROCKS', true)

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/input_Date of Placing_GKH2EKQB'), 
    formattedDate)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/div_Save_flock'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Follow Up Inspections'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ - Follow Up'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/textarea_Contravention Detail_'), 
    'Test automation')

mydate = (new Date() + 2)

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/input_Follow Up Date_GKH2EKQBO'), 
    formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/input_Rectification Date_GKH2E'), 
    formattedDate)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/Page_JClient/input_Premises ID_gwt-TextBox'), 
    '123')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/div_Save_follow up'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/Data Capture Producer/Page_JClient/div_Save_Producer'))

WebUI.delay(2)

