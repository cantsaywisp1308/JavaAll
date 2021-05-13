<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:fo="http://www.w3.org/1999/XSL/Format" 
xmlns:xs="http://www.w3.org/2001/XMLSchema" 
xmlns:fn="http://www.w3.org/2005/xpath-functions">

<xsl:template match="student">
        <h3>Student Info</h3>
        Id: <xsl:value-of select="id"></xsl:value-of>
        <br></br>
        Name: <xsl:value-of select="name"></xsl:value-of>
        <br></br>
        Emails:
        <br></br>
        <ul>
            <xsl:for-each select="email">
                <li>
                    <xsl:value-of select="."></xsl:value-of>
                </li>
            </xsl:for-each>
        </ul>
        DOB: <xsl:value-of select="dob"></xsl:value-of>
        <br></br>
        Place: <xsl:value-of select="dob/@place"></xsl:value-of>
        <br></br>
        Format: <xsl:value-of select="dob/@format"></xsl:value-of>
        <br></br>
        Street: <xsl:value-of select="address/street"></xsl:value-of>
        <br></br>
        Ward: <xsl:value-of select="//ward"></xsl:value-of>
        <br></br>
        <xsl:variable name="pt" select="photo"></xsl:variable>
        <img src="images/{$pt}" height="100" width="100" />
</xsl:template>


</xsl:stylesheet>