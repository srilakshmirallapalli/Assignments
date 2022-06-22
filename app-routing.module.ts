import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { PrivacyComponent } from './privacy/privacy.component';
import { AboutComponent } from './about/about.component';
import { TermsComponent } from './terms/terms.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { AboutCompanyComponent } from './about-company/about-company.component';
import { AboutEmployeesComponent } from './about-employees/about-employees.component';
import { NeftPage1Component } from './neft-page1/neft-page1.component';
import { NeftPage2Component } from './neft-page2/neft-page2.component';
import { NeftPage3Component } from './neft-page3/neft-page3.component';

const routes: Routes = [
  {path:'home', component:NeftPage1Component},
  {path:'NeftPage2', component:NeftPage2Component},
  {path:'NeftPage3', component:NeftPage3Component},
  {path:'**', component:PageNotFoundComponent},
  // {path:'about', component:AboutComponent},
  {path:'home', component:HomeComponent},
  {path:'about',
    children:[
      {path:'company', component:AboutCompanyComponent},
      {path:'employees',component:AboutEmployeesComponent},
      {path:'', component:AboutComponent},
      {path:'**', component:PageNotFoundComponent}
    ]},
  // {path:'privacy', component:PrivacyComponent},
  // // {path:'about', component:AboutComponent},
  // {path:'terms', component:TermsComponent},
  // {path:' ',redirectTo: '/home', pathMatch:'full'},
  // {path:'**', component:PageNotFoundComponent},
]

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes),
    CommonModule
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
