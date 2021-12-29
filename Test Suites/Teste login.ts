<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Teste login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>3a4a81d8-1c98-400c-9ded-d84aa41ef6c1</testSuiteGuid>
   <testCaseLink>
      <guid>bd81c70c-c2a4-488f-82af-022c736b4c43</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC01- Login e senha utilizando variavel</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>704de300-9e21-4dfa-b7b8-44b3e8e08e60</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Logins SFA</testDataId>
      </testDataLink>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>eec889d6-5683-403a-9d47-55c532da4acc</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Mensagem</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>704de300-9e21-4dfa-b7b8-44b3e8e08e60</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>41f6954f-717b-4cc3-a298-09769514bfb5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>704de300-9e21-4dfa-b7b8-44b3e8e08e60</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>56abc991-57ef-4c72-a09e-d06a57c39b01</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>eec889d6-5683-403a-9d47-55c532da4acc</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>mensagem</value>
         <variableId>aa2fdd54-e8b6-4cd7-9afa-2c5b9605c796</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
