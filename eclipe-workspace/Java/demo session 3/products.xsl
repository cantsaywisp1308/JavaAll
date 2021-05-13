<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
xmlns:fo="http://www.w3.org/1999/XSL/Format" 
xmlns:xs="http://www.w3.org/2001/XMLSchema" 
xmlns:fn="http://www.w3.org/2005/xpath-functions">

<xsl:template match="products">
    <html>
        <head>
            <title>Product List</title>
        </head>
        <body>
            <h3>Product List</h3>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Photo</th>
                    <th>Price</th>
                </tr>
            <xsl:for-each select="product">
                    <tr>
                        <td>
                            <xsl:value-of select="./@id"></xsl:value-of>
                        </td>
                            
                        <td>
                            <xsl:value-of select="./@name"></xsl:value-of>
                        </td>
        
                        <td>
                            <xsl:variable name="pt" select="photo"></xsl:variable>
                            <img src="images/{$pt}" height="100" width="100" />
                        </td>
                        <td>
                            <xsl:value-of select="./@price"></xsl:value-of>
                            <xsl:value-of select="./@price/@currency"></xsl:value-of>
                        </td>
                    </tr>
            </xsl:for-each>  
            </table>
        </body>

    </html>
</xsl:template>
</xsl:stylesheet>