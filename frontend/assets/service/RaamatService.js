import Raamat from '~/assets/data/Raamat.class'

export default class RaamatApi {
  constructor ($axios) {
    this.axios = $axios
  }

  findAll () {
    return this.axios({
      method: 'get',
      url: 'raamat',
      withCredentials: true
    }).then((response) => {
      const raamatud = []
      response.data.forEach((raamat) => {
        raamatud.push(new Raamat(raamat.id, raamat.pealkiri, raamat.broneeritud, raamat.laenutatud, raamat.kuup2ev))
      })
      return raamatud
    })
  }

  create (pealkiri) {
    return this.axios({
      method: 'post',
      url: 'raamat',
      data: {
        id,
        pealkiri,
        broneeritud: false,
        laenutatud: false,
        kuup2ev: null
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  broneeri (raamat) {
    return this.axios({
      method: 'put',
      url: 'raamat/' + raamat.id.toString(),
      data: {
        id: raamat.id,
        pealkiri: raamat.pealkiri,
        broneeritud: true
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  laenuta (raamat) {
    return this.axios({
      method: 'put',
      url: 'raamat/' + raamat.id.toString(),
      data: {
        id: raamat.id,
        pealkiri: raamat.pealkiri,
        laenutatud: true
      },
      withCredentials: true
    }).then((response) => {
      return response.data
    })
  }

  deleteItem (id) {
    return this.axios({
      method: 'delete',
      url: 'raamat/' + id.toString(),
      withCredentials: true
    })
  }
}