import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'article',
        loadChildren: () => import('./article/article.module').then(m => m.CommandeCadeauArticleModule),
      },
      {
        path: 'categorie',
        loadChildren: () => import('./categorie/categorie.module').then(m => m.CommandeCadeauCategorieModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class CommandeCadeauEntityModule {}
