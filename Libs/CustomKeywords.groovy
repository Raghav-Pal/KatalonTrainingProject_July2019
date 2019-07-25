
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.model.FailureHandling

import java.lang.String

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.lang.Object

import java.sql.ResultSet

import com.applitools.eyes.RectangleSize

import com.applitools.eyes.selenium.Eyes


def static "com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate"(
    	TestObject to	
     , 	int day	
     , 	int month	
     , 	int year	
     , 	int slideTimeOut	
     , 	FailureHandling flowControl	) {
    (new com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword()).setDate(
        	to
         , 	day
         , 	month
         , 	year
         , 	slideTimeOut
         , 	flowControl)
}

def static "DemoKeywords.hello"() {
    (new DemoKeywords()).hello()
}

def static "DemoKeywords.sayHello"(
    	String name	) {
    (new DemoKeywords()).sayHello(
        	name)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}

def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}

def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}

def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}

def static "com.kms.katalon.keyword.pdf.PDF.getPageNumber"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getPageNumber(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareAllPages"(
    	String file1	
     , 	String file2	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareAllPages(
        	file1
         , 	file2
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesInPageRange(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageRangeAsImages(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareInPageRange"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareInPageRange(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesFromPage(
        	file
         , 	startPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).saveAllPagesAsImages(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.getTextInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextInPageRange(
        	file
         , 	startPage
         , 	endPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.getAllText"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getAllText(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareFromPage"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareFromPage(
        	file1
         , 	file2
         , 	startPage
         , 	excludePattern)
}

def static "com.kms.katalon.keyword.pdf.PDF.savePageAsImage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageAsImage(
        	file
         , 	startPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.extractAllImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractAllImages(
        	file)
}

def static "com.kms.katalon.keyword.pdf.PDF.getTextFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextFromPage(
        	file
         , 	startPage)
}

def static "com.kms.katalon.keyword.pdf.PDF.compareByPixel"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	boolean highlightImageDifferences	
     , 	boolean showAllDifferences	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareByPixel(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	highlightImageDifferences
         , 	showAllDifferences)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}

def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}

def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}

def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}

def static "DemoKeywords2.refreshBrowser"() {
    (new DemoKeywords2()).refreshBrowser()
}

def static "DemoKeywords2.clickElement"(
    	TestObject to	) {
    (new DemoKeywords2()).clickElement(
        	to)
}

def static "DemoKeywords2.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new DemoKeywords2()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}

def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
