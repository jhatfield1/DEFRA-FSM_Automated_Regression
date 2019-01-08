<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CheckEmail</name>
   <tag></tag>
   <elementGuidId>7519fe1d-2aee-475b-bb1f-aeefe69d77c2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:type</name>
      <type>Main</type>
      <value>keep-alive</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_key</name>
      <type>Main</type>
      <value></value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_consumer_secret</name>
      <type>Main</type>
      <value></value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_signature_method</name>
      <type>Main</type>
      <value>keep-alive</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_token</name>
      <type>Main</type>
      <value>godjoy+dfmzmq5t5yjl8</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization:oauth_token_secret</name>
      <type>Main</type>
      <value>8gv6kgklhl5mlimv63tudd9pr6</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://api.guerrillamail.com/ajax.php?f=${f}&amp;seq=${seq}&amp;sid_token=${sid_token}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'check_email'</defaultValue>
      <description></description>
      <id>6976eb5a-ccd2-43e0-986e-4c0bd6f3eb84</id>
      <masked>false</masked>
      <name>f</name>
   </variables>
   <variables>
      <defaultValue>'0'</defaultValue>
      <description></description>
      <id>5a1d7696-0a06-43bd-82ee-8b96c8d3d71f</id>
      <masked>false</masked>
      <name>seq</name>
   </variables>
   <variables>
      <defaultValue>'0o023c6smtcm8i1somj12o63o6'</defaultValue>
      <description></description>
      <id>65ac8e57-5dd2-4b89-b8c5-c5e2598a837a</id>
      <masked>false</masked>
      <name>sid_token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
