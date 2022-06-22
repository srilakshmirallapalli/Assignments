import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { SimpleIntCalcComponent } from './simple-int-calc/simple-int-calc.component';
import { FormsModule,ReactiveFormsModule  } from '@angular/forms';
import { CurrencyConversionComponent } from './currency-conversion/currency-conversion.component';
import { CubePipe } from './cube.pipe';
import { SimpleIntPipe } from './simpleint.pipe';
import { PayeeModule } from './payee/payee.module';
import { StatementModule } from './statement/statement.module';
import { UserDetailsComponent } from './user-details/user-details.component';
import {HttpClientModule} from '@angular/common/http';
import { PhotoDetailsComponent } from './photo-details/photo-details.component';
import { HomeComponent } from './home/home.component';
import { TermsComponent } from './terms/terms.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { AboutComponent } from './about/about.component';
import { AppRoutingModule } from './app-routing.module';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AboutEmployeesComponent } from './about-employees/about-employees.component';
import { AboutCompanyComponent } from './about-company/about-company.component';
import { EmployeeComponent } from './employee/employee.component';
import { Employee1Component } from './employee1/employee1.component';
import { NeftPage1Component } from './neft-page1/neft-page1.component';
import { Employee2Component } from './employee2/employee2.component';
import { Employee3Component } from './employee3/employee3.component';
import { NeftPage2Component } from './neft-page2/neft-page2.component';
import { TransferModule } from './transfer/transfer.module';
import { NeftPage3Component } from './neft-page3/neft-page3.component';
import { FlightComponent } from './flight/flight.component';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    SimpleIntCalcComponent,
    CurrencyConversionComponent,
    CubePipe,
    SimpleIntPipe,
    UserDetailsComponent,
    PhotoDetailsComponent,
    HomeComponent,
    TermsComponent,
    PrivacyComponent,
    AboutComponent,
    PageNotFoundComponent,
    AboutEmployeesComponent,
    AboutCompanyComponent,
    EmployeeComponent,
    Employee1Component,
    NeftPage1Component,
    Employee2Component,
    Employee3Component,
    NeftPage2Component,
    NeftPage3Component,
    FlightComponent,
  ],
  imports: [
    BrowserModule,
    TransferModule,
    FormsModule,
    PayeeModule,
    StatementModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
