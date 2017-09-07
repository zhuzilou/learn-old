import { Logger } from "../log/logger.service";
import { UserService } from "../user/user.service";
import { HeroService } from "../hero/hero.service";

let heroServiceFactory = (logger: Logger, userService: UserService) => {
  logger.log(userService.user.name);
  return new HeroService(logger, userService.user.isAuthorized);
};

export let heroServiceProvider = {
    provide: HeroService,
    useFactory: heroServiceFactory,
    deps: [Logger, UserService]
};