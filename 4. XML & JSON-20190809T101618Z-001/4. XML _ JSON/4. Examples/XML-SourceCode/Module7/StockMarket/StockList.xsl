<?xml version="1.0" encoding="UTF-8" ?>

<!--
    Document   : StockList.xsl
    Author     : vincent
    Description:
        Stylesheet file to transform the StockExchange.xml document.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html"/>

  <xsl:template match="/Stocks">
    <h1>Stock Exchange List</h1>    
    <!-- Table Header Creation -->
    <table border="1">
      <tr>
        <th>Name</th>
        <TH>Share Value</TH>
        <th>Director</th>
      </tr>
      
      <xsl:for-each select="Stock">
        <tr>
          <td>
            <xsl:value-of select="Name"/>
          </td>
          <td>
            <xsl:value-of select="ShareValue"/>
          </td>
          <td>
            <xsl:value-of select="Director"/>
          </td>
        </tr>
      </xsl:for-each>
      
    </table>
    <br/>
    Name of the Companies in the Stock Exchange starting with letter 'C' and 
    their Share price values are:
    <ul>
      
      <xsl:for-each select="Stock">
        <xsl:if test="starts-with(@symbol, 'C')">
          <li>
            <xsl:value-of select="concat(@symbol,' - ', Name)"/>        
            <br/>
            <xsl:text>Share Value: </xsl:text>
            <xsl:value-of select="round(ShareValue)"/>
          </li>
        </xsl:if>
      </xsl:for-each>
      
    </ul>
  </xsl:template>

</xsl:stylesheet>
