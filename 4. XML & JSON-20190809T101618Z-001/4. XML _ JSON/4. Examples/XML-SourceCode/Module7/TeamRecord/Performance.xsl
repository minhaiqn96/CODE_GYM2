<?xml version="1.0" encoding="UTF-8" ?>

<!--
    Document   : Performance.xsl
    Author     : vincent
    Description:
        Stylesheet file to transform the TeamPerformance.xml document.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html"/>

  <xsl:template match="/Team">
    <h1>Team Performance</h1>
    <!-- Table Header Creation -->
    <table border="1">
      <tr>
        <th>Team</th>
        <th>Won</th>
        <th>Lost</th>
        <th>Draw</th>
        <th>Points</th>
      </tr>
      
      <xsl:for-each select="Data">
        <tr>
          <td>
            <xsl:value-of select="Name"/>
          </td>
          <td>
            <xsl:value-of select="Won"/>
          </td>
          <td>
            <xsl:value-of select="Lost"/>
          </td>
          <td>
            <xsl:value-of select="Draw"/>
          </td>
          <td>
            <xsl:value-of select="Points"/>
          </td>
        </tr>
      </xsl:for-each>
      
    </table>
    <br/>The team
    <xsl:for-each select="Data">		
      <xsl:if test="Points &gt; 900">				
        <b><xsl:value-of select="Name"/></b>
      </xsl:if>
    </xsl:for-each>
    qualify for the World Cup.
  </xsl:template>

</xsl:stylesheet>
