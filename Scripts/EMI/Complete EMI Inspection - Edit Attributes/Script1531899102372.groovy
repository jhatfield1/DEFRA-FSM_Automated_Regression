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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

KeywordLogger log = new KeywordLogger('')

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/div_Edit attributes'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_County Parish Holding (C'), '11/222/3333')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Trading Name_gwt-TextBox'), 'Test Automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/JM_8918/Page_JClient/select_Compliance (Schedule  A'), 'COMPLIANCE', 
    true)

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/input_Have the egg throughputs'))

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Organic_gwt-DoubleBox GF'), '10')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Free Range_gwt-DoubleBox'), '10')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Barn_gwt-DoubleBox GFNJN'), '10')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Cage Enriched_gwt-Double'), '12')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Organic_gwt-DoubleBox GF - EP Imp'), '11')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Free Range_gwt-DoubleBox - EP Imp'), '11')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Barn_gwt-DoubleBox GFNJN - Ep Imp'), '11')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Cage Enriched_gwt-Double - Ep Imp'), '11')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Organic_gwt-DoubleBox GF - Wh Reg'), '12')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Free Range_gwt-DoubleBox - Wh Reg'), '12')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Cage Enriched_gwt-Double - Wh Reg'), '12')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Barn_gwt-DoubleBox GFNJN - Wh Reg'), '12')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Organic_gwt-DoubleBox GF - Wh Imp'), '13')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Free Range_gwt-DoubleBox - Wh Imp'), '13')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Barn_gwt-DoubleBox GFNJN - Wh Imp'), '13')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Cage Enriched_gwt-Double - Wh Imp'), '13')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Throughput Changed To (U'), '50')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Throughput Changed To (I'), '55')

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/input_Was the inspection compl'))

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/input_Accreditation Body_gwt-u'))

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Packer Throughput_gwt-Do'), '100')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Wholesaler Throughput_gw'), '150')

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Importer Throughput_gwt-'), '200')

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/div_Signatures  Remarks'))

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/img_Inspector Signature_gwt-Im'))

WebUI.click(findTestObject('JM_8918/EMI/Packer Edit Attributes/Page_JClient/Page_JClient/div_Unable To Sign_Inspector'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/img_Recipient Signature_gwt-Im'))

WebUI.click(findTestObject('JM_8918/EMI/Packer Edit Attributes/Page_JClient/Page_JClient/div_Unable To Sign_Recipient'))

WebUI.setText(findTestObject('Object Repository/JM_8918/Page_JClient/input_Recipient Name_gwt-TextB'), 'Test automation')

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/input_Recipient Position_radio'))

WebUI.click(findTestObject('Object Repository/JM_8918/Page_JClient/div_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('JM_8918/EMI/Packer Edit Attributes/Page_JClient/div_Save - Job Details'))

