<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="states">
        <HTML>
            <HEAD>
                <TITLE>
                    The States
                </TITLE>
            </HEAD>
            <BODY>
                <H1>
                    The States
                </H1>
                <xsl:apply-templates select="state"/>
            </BODY>
        </HTML>
    </xsl:template>

    <xsl:template match="state">
        <xsl:if test="position() = 1"><xsl:element name="HR"/></xsl:if>
        <P>
            <xsl:value-of select="position()"/>. <xsl:value-of select="name"/>
        </P>
        <xsl:if test="position() = last()"><xsl:element name="HR"/></xsl:if>
    </xsl:template>

</xsl:stylesheet>

