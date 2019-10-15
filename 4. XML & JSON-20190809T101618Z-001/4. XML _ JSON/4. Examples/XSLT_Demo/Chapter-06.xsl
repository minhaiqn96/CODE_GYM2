<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="states">
        <HTML>
            <HEAD>
                <TITLE>
                    The States
                </TITLE>
            </HEAD>
            <BODY BGCOLOR="GREEN">
                <xsl:apply-templates select="state"/>
            </BODY>
        </HTML>
    </xsl:template>

    <xsl:template match="state">
        <xsl:choose>
            <xsl:when test="name = 'California'">
                <P>
                    <FONT COLOR="RED">
                        <xsl:value-of select="name"/>
                    </FONT>
                </P>
            </xsl:when>
            <xsl:when test="name = 'Massachusetts'">
                <P>
                    <FONT COLOR="WHITE">
                        <xsl:value-of select="name"/>
                    </FONT>
                </P>
            </xsl:when>
            <xsl:when test="name = 'New York'">
                <P>
                    <FONT COLOR="BLUE">
                        <xsl:value-of select="name"/>
                    </FONT>
                </P>
            </xsl:when>
            <xsl:otherwise>
                 <P>
                     <xsl:value-of select="."/>
                 </P>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

</xsl:stylesheet>

