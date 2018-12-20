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

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Edit attributes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Yes_radio_group_1'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Does the operator wish t'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/textarea_Name and address of p'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_None_gwt-uid-103'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Avipro Vac E_gwt-uid-105'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Has the flock been treat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/select_WaterFeed'), 
    'WATER', true)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Name of product_gwt-Text'), 
    'Test automation')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_No. of houses (Complete'), 
    '2')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_NCP Salmonella Record Chec'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_NCP Salmonella Record Ch'))

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save - Salmonella'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Record Check Details'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Total No. of flocks on p'), 
    '5')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_No. of birds on premises'), 
    '10')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Housing typepremises_gwt'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Cage_gwt-uid-163'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_BarnHoused_gwt-uid-164'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Free Range_gwt-uid-165'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Rearing_gwt-uid-166'))

WebUI.setText(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Barn'), '1')

WebUI.setText(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Cage'), '1')

WebUI.setText(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Conventional'), 
    '1')

WebUI.setText(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Free'), '1')

WebUI.setText(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Rearing'), 
    '1')

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_ No. of flocks - Free'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Are movement records up'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/input_Are movement records up_2'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_If No please comment_rad'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_Are  the medicine record'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_If No please comment_rad_1'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/input_If No please give detail'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/textarea_If Yes please comment'), 
    'Test automation')

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save - Record Check'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Biosecurity Assessment'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/select_NoneOne minor issue - G'), 
    'ONE_MINOR_ISSU_GOOD', true)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/textarea_Specify_gwt-TextArea'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/img_Signature_gwt-Image'))

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/UnableToSign'))

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save - Biosecurity'))

WebUI.delay(2)

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/input_When last administered_G'), formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save'))

