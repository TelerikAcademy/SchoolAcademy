<!-- section start -->

<!-- attr: {id: 'title', class: 'slide-title', hasScriptWrapper: true} -->
# Environment Setup

<div class="signature">
    <p class="signature-course">Databses with Java</p>
    <p class="signature-initiative">Telerik School Academy</p>
    <a href="http://academy.telerik.com" class="signature-link">http://academy.telerik.com</a>
</div>

<!-- section start -->

<!-- attr: { id:'table-of-contents' } -->
# Table of Contents

- Requirements

<!--  section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Requirements -->

# Requirements


# Download

- Download and Install/Unzip:
  - [Oracle Database Express Edition](http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html)
    - **Remember password**
  - [Download SQL Developer Tool](http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html)
  - Make sure the Oracle database service is running
  - Start the Database
    - Go to `[install_dir]\oraclexe\app\oracle\product\11.2.0\server\bin` and start `StartDB.bat`
  - Start Oracle SQL Developer
    - Make a new Connection with
      - username: **System**
      - password: **[your password]**

# Errors
- Fix Listener
  - Run `Cmd` as administrator
  - type `lsnrclt status`
    - type `lsnrclt start` if an error occurs
- Fix connection
  - Open `D:\oraclexe\app\oracle\product\ 11.2.0\server\network\ADMIN\tnsnames.ora`



<!-- section start  -->

# Useful Links
- [Oracle Database Express Edition Documentation](https://docs.oracle.com/cd/E17781_01/index.htm)

<!-- section start  -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Questions
##  HTML Fundamentals -->
