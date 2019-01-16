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

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/div_Edit attributes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Yes_radio_group_1'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Incident reference when'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Year_gwt-DoubleBox GFNJN'), 
    '2018')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_APHA (Field Services) Of'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Sequential No._gwt-Doubl'), 
    '4321')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Does the operator wish t'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/textarea_Name and address of p'), 
    'Test automation')

WebUI.delay(2)

if (SampleType == 'Broiler Samples') {
    WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Total No. of flocks on p'), 
        '5')
}

if (SampleType == 'Breeding Turkey Samples') {
    WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Total No. of flocks on p_2'), 
        '5')
}

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_No. of birds on premises'), 
    '50')

if (SampleType == 'Broiler Samples') {
    WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_No. of houses on premise'), 
        '2')
}

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_No. of crops per year_gw'), 
    '4')

if (SampleType == 'Breeding Turkey Samples') {
    WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Turkeys/Page_JClient/input_NCP Holding Type_radio_g'))
}

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_State whether convention'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Avipro Duo_gwt-uid-106'))

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Gallimune SEST_gwt-uid-1'))

if (SampleType == 'Broiler Samples') {
    WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Has the flock been treat'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/select_WaterFeed'), 
        'WATER', true)

    WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_Name of product_gwt-Text'), 
        'test automation')

    mydate = new Date()

    formattedDate = mydate.format('dd/MM/yyyy')

    WebUI.sendKeys(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/input_When last administered_G'), formattedDate)
}

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit - Broilers/Page_JClient/input_No. of houses (Complete'), 
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
	'NONE', true, FailureHandling.STOP_ON_FAILURE)
WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/select_NoneOne minor issue - G'),
	'ONE_MINOR_ISSU_GOOD', true, FailureHandling.STOP_ON_FAILURE)
WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/select_NoneOne minor issue - G'),
	'TWO_TO_FOUR_MINOR_ISSU_SATI', true,FailureHandling.STOP_ON_FAILURE)
WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/select_NoneOne minor issue - G'),
	'ONE_MAJOR_OR_FIVE_MINO_ISSU', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Page_JClient/textarea_Specify_gwt-TextArea'), 'Test Automation')

WebUI.click(findTestObject('FSM1/NCP/Page_JClient/Page_JClient/img_Signature_gwt-Image_TOP'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/FSM1/NCP/Page_JClient/img_Signature_gwt-Image'))

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/NCP/Page_JClient/Page_JClient/input_If non-compliant Date'), formattedDate)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Page_JClient/select_NorthScotlandSouthernWa'), 'NORTH',
	true)

WebUI.selectOptionByValue(findTestObject('FSM1/NCP/Page_JClient/select_LeadVet'), 'NORTH_LEAD_VET', true)


WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save - Biosecurity'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Edit Attributes/Page_JClient/div_Save'))

