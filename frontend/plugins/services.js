import RaamatService from '~/assets/service/RaamatService'
import LoginService from '~/assets/service/LoginService'

export default (ctx, inject) => {
  const services = {
    login: new LoginService(ctx.$axios),
    raamat: new RaamatService(ctx.$axios)
  }

  inject('services', services)
}