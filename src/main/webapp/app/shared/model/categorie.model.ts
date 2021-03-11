import { IArticle } from 'app/shared/model/article.model';

export interface ICategorie {
  id?: number;
  nom?: string;
  categorie?: IArticle;
  categorie?: IArticle;
}

export class Categorie implements ICategorie {
  constructor(public id?: number, public nom?: string, public categorie?: IArticle, public categorie?: IArticle) {}
}
