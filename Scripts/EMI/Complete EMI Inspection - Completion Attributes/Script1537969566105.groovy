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

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/div_STARTED (locked)'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/div_COMPLETED'))

WebUI.delay(2)

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/OrganicNumber'), '1')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/FreeRangeNumber'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/OrganicCompliant'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/FreeRangeNumber1'), '1')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/BarnNumber'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/FreeRangeCompliant'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/BarnNumber1'), '1')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/CageEnriched'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/BarnNumberCompliant'))

WebUI.setText(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/CageEnriched1'), '1')

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/VeterinaryRecords'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/CageEnrichedCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/VeterinaryMedical'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/HygieneCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/WelfareCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/SalmonellaCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/VMDCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/PremisesCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/PremisesTempCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/EquipmentCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/QualityCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/WeightGradingCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/ProductionCompliant'))

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/MarkingEggsCompliant'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/LabellingCompliant1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/Page_JClient/Page_JClient/select_Yes'), 
    'COMPLETED', true)

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/Page_JClient/div_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('FSM1/Complete Egg Inspection/CompletionAttributes/Page_JClient/CompletedOK'))

WebUI.delay(30)

