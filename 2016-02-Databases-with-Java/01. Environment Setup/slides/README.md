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
- Prerequisites & Installation
- Installing useful tools
  - SQL Developer Tool

<!--  section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Prerequisites & Installation -->

# Prerequisites
- There is a minimum of `1` `GB` of physical memory
- Sufficient paging space is available
- The appropriate service packs or patches for your operating system are installed
- An appropriate file system format is being used
  - Must be on a `NTFS` partition
- [Database Installation Guide](http://www.oracle.com/pls/topic/choose?ctx=db112&ids=NTDBI+LADBI+AXDBI+HPDBI+SSDBI)

# Installation
- Log on to your computer as a member of the administrative group
- Installing Oracle Database
  - Go to [www.oracle.com](http://www.oracle.com/index.html) > Downloads
  - Download Oracle Database 11g Release 2 Standard Edition (SE2)
  - Extract zips and run `setup.exe`
- [Instalation notes](http://docs.oracle.com/cd/E11882_01/server.112/e10897/install.htm)
- [Oracle Database Online Documentation 12c](http://docs.oracle.com/database/121/index.htm)

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-1.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-2.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-3.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-4.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
- Important to remember password
<img class="slide-image" src="imgs/install-step-5.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-6.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-7.png" style="width:90%; top:20%; left:5%" />

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # Installation -->
<img class="slide-image" src="imgs/install-step-8.png" style="width:70%; top:20%; left:10%" />
<img class="slide-image fragment" src="imgs/install-step-8.2.png" style="width:30%; top:60%; left:60%" />


<!--  section start -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Installing Tools -->

# Installing Tools
- SQL Developer Tool
  - Go to [SQL Developer > Downloads](http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html)
  - Download & extract SQL Developer Tool
  - Create `new` Connection
    - username: **system**
    - password: **[your password]**

<!-- attr: { showInPresentation:true, hasScriptWrapper:true } -->
<!-- # SQL Developer Tool -->
<img class="slide-image" src="imgs/sql-developer-new-connection.png" style="width:70%; top:20%; left:10%" />

<!-- attr: { class:'slide-section demo', showInPresentation:true } -->
<!-- # SQL Developer -->
## [Demo]()

<!-- # Errors
- Fix Listener
  - Run `Cmd` as administrator
  - type `lsnrclt status`
    - type `lsnrclt start` if an error occurs
- Fix connection
  - Open `D:\oraclexe\app\oracle\product\ 11.2.0\server\network\ADMIN\tnsnames.ora` -->


<!-- section start  -->

<!-- attr: { class:'slide-section', showInPresentation:true } -->
<!-- # Questions
##  HTML Fundamentals -->