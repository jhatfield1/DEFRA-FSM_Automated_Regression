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

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/div_Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/div_Packer'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/PreProd/Page_JClient/CreateButton'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/select_ADLAORAPLAQYASDCATCCICS'), 
    'ADL', true)

WebUI.setText(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Inspection Duration 1 (m'), '10')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/Page_JClient/input_Premises_radio_group_1'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Yes_radio_group_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Page_JClient/input_Premises Contravention_g'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Equipment_radio_group_2'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Quality_radio_group_3'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Weight_radio_group_4'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Marking (Eggs)_radio_gro'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Grading (Time  Movement)'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Packaging_radio_group_7'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Labelling  Id_radio_grou'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Records (EggsHens)_radio'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/input_Yes_radio_group_10'))

WebUI.click(findTestObject('Object Repository/JM_8918/EMI/Packer/Page_JClient/div_Save'))

WebUI.delay(2)

