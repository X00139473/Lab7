
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">
    </head>
    <body>

            <ul>
                <li><a href=""""),_display_(/*20.31*/routes/*20.37*/.HomeController.index()),format.raw/*20.60*/("""">Home</a></li>
                <li><a href=""""),_display_(/*21.31*/routes/*21.37*/.HomeController.about()),format.raw/*21.60*/("""">About</a></li>
                <li><a href=""""),_display_(/*22.31*/routes/*22.37*/.HomeController.products()),format.raw/*22.63*/("""">Products</a></li>
            </ul>
            <hr>

        """),format.raw/*27.32*/("""
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""

        """),format.raw/*30.9*/("""<hr>
        <h4> Copyright &copy 2017</h4>

        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("javascripts/main.js")),format.raw/*33.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 14:26:48 GMT 2017
                  SOURCE: /home/wdd/webapps/play/lab3/app/views/main.scala.html
                  HASH: 6b106c7570d7d15908bfdb1014aad6c33b3d865e
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1625->481|1640->487|1703->528|1791->589|1806->595|1867->634|1968->708|1983->714|2027->737|2100->783|2115->789|2159->812|2233->859|2248->865|2295->891|2387->1045|2424->1055|2452->1062|2489->1072|2583->1139|2598->1145|2659->1185
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|57->27|58->28|58->28|60->30|63->33|63->33|63->33
                  -- GENERATED --
              */
          