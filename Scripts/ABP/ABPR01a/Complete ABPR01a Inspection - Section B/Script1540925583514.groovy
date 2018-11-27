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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Biogas_gwt-uid-92'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/select_All Category 3 by-produ'), 
    'Category 3 by-products', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Structure_radio_group_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Operations_radio_group_5'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__5'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__6'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(b) Equipment usage_radi'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(c) Availability of a do'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(d) Plant cleanliness_ra'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(e) Cleandown of exposed'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(f) Pest control_radio_g'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(g) Security of processe'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__7'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(b) to mains drains in l'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(c) to land or soakaway'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(d) absorbed and process'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__8'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__9'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__10'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__11'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Operations - Transport_r'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__12'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__13'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__14'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Operations - Microbiolog'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__15'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__16'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/span_Yes'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__17'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Records_radio_group_32'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_If records have not been'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__18'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_What is the date of the'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__19'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_To_radio_group_37'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__20'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_b. ABP category of mater'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_c. Volume of material (w'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_No_radio_group_41'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_e. Name and address of h'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_f. Name and address of r'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_g. Grazing ban requireme'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_No_radio_group_45'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/textarea_Not Checked_gwt-TextA'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__21'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(b) Do pest control reco'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__22'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Not Checked_radio_group__23'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(c) In your opinion does'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/textarea_Please give details o'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(a) Back trace (complete'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Yes_radio_group_52'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_(b) Forward trace (compl'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/input_Yes_radio_group_54'))

mydate = new Date()

formattedDate = mydate.format('MM/dd/yyy')

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/CalibrationDate'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/DocumentFromDate'), formattedDate)

WebUI.sendKeys(findTestObject('FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/DocumentToDate'), formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR01a Section B/Page_JClient/div_Save'))

