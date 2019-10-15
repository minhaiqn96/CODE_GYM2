<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    version='1.0'>

    <xsl:template match="states">
        <fo:root>

            <fo:layout-master-set>
                 <fo:simple-page-master master-name="mainPage"
                     page-height="300mm" page-width="200mm"
                     margin-top="20mm" margin-bottom="20mm"
                     margin-left="20mm" margin-right="20mm">

                     <fo:region-body
                       margin-top="0mm" margin-bottom="10mm"
                       margin-left="0mm" margin-right="0mm"/>

                     <fo:region-after extent="20mm"/>
                 </fo:simple-page-master>
             </fo:layout-master-set>

             <fo:page-sequence master-reference="mainPage">
                 <fo:flow  flow-name="xsl-region-body">
                     <xsl:apply-templates/>
                 </fo:flow>
             </fo:page-sequence>

        </fo:root>
    </xsl:template>

    <xsl:template match="state/name">
        <fo:block font-weight="bold" font-size="18pt"
            line-height="24pt" font-family="sans-serif"
            text-decoration="underline">
            Name:
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

    <xsl:template match="state/population">
        <fo:block font-size="18pt" line-height="24pt"
            font-family="sans-serif">
            Population (people):
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

    <xsl:template match="state/capital">
        <fo:block font-size="18pt" line-height="24pt" font-family="sans-serif">
            Capital:
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

    <xsl:template match="state/bird">
        <fo:block font-size="18pt" line-height="24pt" font-family="sans-serif">
            Bird:
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

    <xsl:template match="state/flower">
        <fo:block font-size="18pt" line-height="24pt" font-family="sans-serif">
            Flower:
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

    <xsl:template match="state/area">
        <fo:block font-size="18pt" line-height="24pt" font-family="sans-serif">
            Area (square miles):
            <xsl:value-of select="."/>
        </fo:block>
    </xsl:template>

</xsl:stylesheet>