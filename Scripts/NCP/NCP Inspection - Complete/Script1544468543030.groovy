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

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/div_STARTED'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/div_COMPLETED'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/select_Yes'), 
    'COMPLETED', true)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/input_Number of 14 hour units'), 
    '4')

if (WebUI.verifyElementVisible(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/input_Is another APHA sampling'), 
    FailureHandling.OPTIONAL)) 
{
    WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/input_Is another APHA sampling'))

    mydate = new Date()

    tomorrow = mydate.next()

    formattedDate = tomorrow.format('MM/dd/yyyy')

    WebUI.sendKeys(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/input_From date_GKH2EKQBOHC'), formattedDate)

    WebUI.sendKeys(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/input_To date_GKH2EKQBOHC'), formattedDate)
}

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Complete Inspection/Page_JClient/img_Signature_gwt-Image'))

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/div_Unable To Sign'))

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/div_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('FSM1/NCP/Complete Inspection/Spy/Page_JClient/OK complete'))

WebUI.delay(30)

