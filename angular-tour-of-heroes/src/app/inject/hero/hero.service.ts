import { Injectable } from "@angular/core";
import { Logger } from "../log/logger.service";
import { Hero } from "./hero";
import { HEROES } from "../mock/mock-heros";


@Injectable()
export class HeroService {
     constructor(private logger: Logger, private isAuthorized: boolean) {  }

      getHeroes() { return HEROES; }
}